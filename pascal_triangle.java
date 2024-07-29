/**
 * pascal_triangle
 */
public class pascal_triangle {

    public static void main(String[] args) {
        
        int n = 5;

        for (int i=1; i<=n; i++){

            //space
            int space = ( n-i );
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                
                int a = i;
                int b = j;
        
                if ( a == i && b == 1 || a == b ){
                    System.err.print("1 ");
                } else if ( a == 3 && b == 2 ) {
                    System.out.print("2 ");
                } else if ( a == 4 && b == 2 || a == 4 && b == 3 ) {
                    System.out.print("3 ");
                } else if ( a == 5 && b == 2 || a == 5 && b == 4 ) {
                    System.out.print("4 ");
                } else if ( a == 5 && b == 3 ) {
                    System.out.print("6 ");
                }

                
                
                
                
                
                
                
                 else {
                    System.out.print("  ");
                }

            }


            System.out.println();
        }
    }
}