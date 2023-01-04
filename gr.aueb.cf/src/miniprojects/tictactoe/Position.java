package miniprojects.tictactoe;

 class Position {

     private int row;
     private int column;

      Position(int row, int column) {
         this.row = row;
         this.column = column;
     }

      int getRow() {
         return row;
     }

      int getColumn() {
         return column;
     }
 }
