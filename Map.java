import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class will contain all the elements on the game map.
 */
public class Map {
    private final int size;
    private Spaces lastMove;
    private Spaces[][] map;

    public Map(int size) {
        this.size = size;
        this.map = new Spaces[size][size];
        mapInitialize();
    }

    /**
     * initialize map with different kinds of spaces
     */
    public void mapInitialize() {
        for(int i = 0; i < size; ++i){
            for(int j = 0; j < size; ++j){
                if (i == 0 && j == 0){
                    map[i][j] = new CurrentSpace();
                    continue;
                }
                // make sure we won't stick at the beginning
                if (i <= 2 && j <= 2){
                    if (i == 1 && j == 0){
                        // give a market space at the beginning
                        map[i][j] = new MarketSpaces();
                        continue;
                    }
                    map[i][j] = new CommonSpaces();
                    continue;
                }
                // assign the rest randomly based on the possibility of 20% 30% 50%
                int rand = ThreadLocalRandom.current().nextInt(1, 100 + 1);
                if (rand >= 1 && rand < 24) {
                    map[i][j] = new InaccessibleSpaces();
                } else if (24 <= rand && rand < 55) {
                    map[i][j] = new MarketSpaces();
                } else {
                    map[i][j] = new CommonSpaces();
                }
            }
        }
    }

    /**
     * print the map
     */
    public void printMap(){
        System.out.println("Here is the world map!!    (o marks your current location)");
        System.out.println("X means the space is inaccessible, and M represents Market");
        StringBuilder sb = new StringBuilder("");
        sb.append("+---".repeat(Math.max(0, this.size)));
        sb.append("+");

        for (Spaces[] row : map) {
            System.out.println(sb);

            for (Spaces col : row) {
                // put the mark to each spaces
                System.out.print("|" + col.getFeature() + "");
            }
            System.out.println("|");
        }
        System.out.println(sb);
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public Spaces getLastMove() {
        return lastMove;
    }

    public Spaces[][] getMap() {
        return map;
    }

    /**
     * store the space that has been covered by hero and mark current space.
     * @param row row
     * @param col col
     */
    public void setMark(int row, int col) {
        lastMove = map[row][col];
        map[row][col] = new CurrentSpace();
    }

    /**
     * wipe the current space and change it back
     * @param row row
     * @param col col
     */
    public void clearMove(int row, int col){
        map[row][col] = lastMove;
    }

    public void specialSet(){
        map[0][0] = new CommonSpaces();
    }
}


