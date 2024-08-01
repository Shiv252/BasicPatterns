public class pattern1 {

public static void main(String[] args) {
    
 //starPrint(8);
 //p2(5);
//p3(5);
 diamond(3);
}


static void starPrint( int n){
    for(int row=1 ; row<=n; row++) {
        for (int col = 1; col <= row; col++) {
            System.err.print("* ");
        }
        System.out.println();
    }
}

static void p2(int n){
    for (int index = 1; index <= n; index++) {
        for (int col = 1; col <= n-index+1; col++) {
            System.out.print(col);
        }
        System.out.println();
    }
}

static void p3(int n){
    for (int i = 1; i <=2*n-1; i++) {
    int  columnValue = i<n ? i : 2*n -i;  
        for (int col = 1; col <=columnValue ; col++) {
            System.out.print(col);
        }
        System.out.println();
    }
}

static void diamond(int n){
  for (int index = 1; index <= 2*n-1; index++) {
    int colValue= index>n?2*n-index:index;
    int space = n-colValue;
    for (int sp = 0; sp <space ; sp++) {
        System.out.print(" ");
    }
    for (int col = 1; col <= colValue; col++) {
        System.out.print("* ");
    }
    System.out.println();
  }

}
}