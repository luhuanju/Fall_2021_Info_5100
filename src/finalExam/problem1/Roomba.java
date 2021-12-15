package finalExam.problem1;

public class Roomba implements iRobot{

    //not cleaned, it is '0'
    //is cleaned, it is '1'
    //blocked, it is '-1'

   final static int NOTCLEAN=0;
   final static int CLEAN=1;
   final static int BLOCK=-1;

    int[][] room =new int[][]{{0,0,0}, {-1,0,-1} ,{0,0,-1}};
    int m=room.length;
    int n=room[0].length;

    private Direction initialDirection= Direction.DOWN;
    private int[] curCell=new int[]{0,0};

    @Override
    public boolean move() {
        switch (initialDirection){
            case UP:
            {
                int newX=curCell[0]-1, newY=curCell[1];
                if(newX<0||newY<0||newX>=m||newY>=n) return false;// out of the corner
                if(room[newX][newY]==BLOCK)return false; // the next is get blocked

                curCell[0]=newX;
                curCell[1]=newY;
            }
                break;
            case DOWN:
            {
                int newX=curCell[0]+1, newY=curCell[1];
                if(newX<0||newY<0||newX>=m||newY>=n) return false;
                if(room[newX][newY]==BLOCK)return false;

                curCell[0]=newX;
                curCell[1]=newY;
                return true;
            }
            case LEFT:
            {
                int newX=curCell[0], newY=curCell[1]-1;
                if(newX<0||newY<0||newX>=m||newY>=n) return false;
                if(room[newX][newY]==BLOCK) return false;

                curCell[0]=newX;
                curCell[1]=newY;
                return true;
            }
            case RIGHT:
            {
                int newX=curCell[0], newY=curCell[1]+1;
                if(newX<0||newY<0||newX>=m||newY>=n) return false;
                if(room[newX][newY]==BLOCK)return false;

                curCell[0]=newX;
                curCell[1]=newY;
                return true;
            }
        }
        return false;
    }

    @Override
    public void turnLeft() {
        switch (initialDirection){
            case UP:
                initialDirection=Direction.LEFT;
                break;
            case DOWN:
                initialDirection=Direction.RIGHT;
                break;
            case RIGHT:
                initialDirection=Direction.UP;
                break;
            case LEFT:
                initialDirection=Direction.DOWN;
                break;
        }

    }

    @Override
    public void turnRight() {
        switch (initialDirection){
            case UP:
                initialDirection=Direction.RIGHT;
                break;
            case DOWN:
                initialDirection=Direction.LEFT;
                break;
            case RIGHT:
                initialDirection=Direction.DOWN;
                break;
            case LEFT:
                initialDirection=Direction.UP;
                break;
        }

    }

    @Override
    public void clean() {
        if (room[curCell[0]][curCell[1]]!=BLOCK){
            room[curCell[0]][curCell[1]]=1;
        }
    }

}
