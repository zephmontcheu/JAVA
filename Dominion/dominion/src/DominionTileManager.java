import gdi.game.dominion.DominionTile;
import gdi.game.dominion.DominionTileManagerInterface;
import gdi.game.map.MapWorld;

public class DominionTileManager  implements DominionTileManagerInterface {

    DominionTile[][] map ;
    DominionTileManager( int column , int rows){
        if ( column > 0 && rows > 0)
        this.map = new DominionTile[column][rows];
    }
     @Override
    public DominionTile[] getColumn( int col){
        if ( col >= 0 && col < map.length)
        return map[col];
        return null;
     }

    @Override
    public int getNumColumns() {
        return this.map.length;
    }

    @Override
    public int getNumRows() {
        if (map.length == 0)
            return 0;
        return this.map[0].length;
    }

    @Override
    public DominionTile getTile(int col, int row) {
        if(isValid(col,row))
            return map[col][row];

            return null;
    }

    @Override
    public boolean isValid(int col, int row) {
        if ( col < 0 || col > this.map.length ) {
            if (row < 0 || row > map[0].length)
                return false;
        }
        return true;
    }

    @Override
    public void setupMapTiles(MapWorld mapWorld) {
        for ( int i = 0  ; i< getNumColumns(); i++){
            for ( int j=0 ; j < getNumRows(); j++){
                map[i][j]= new DominionTile(mapWorld,i,j);
            }
        }
    }

    public DominionTile[][] getMap() {
        return map;
    }
}
