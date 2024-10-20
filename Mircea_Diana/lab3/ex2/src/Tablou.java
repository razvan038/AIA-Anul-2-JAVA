import java.io.*; //pentru programul cu matricea
//vector citire tastatura si afisare
/*import java.io.*; //pentru programul cu vectorul
public class Tablou {
    public static void main(String[] args) throws IOException {
        // Prompt the user to enter the first number
        System.out.println("Introduceti primul numar: ");
        int x = citesteNr();
        // Display the entered number
        System.out.println("Numarul introdus este: " + x);
        // Prompt the user to enter the vector
        System.out.println("Introduceti vectorul: ");

        int v[] = new int[x];
        // Read the vector elements from the user
        for (int i = 0; i < v.length; i++) {
            v[i] = citesteNr();
        }

        // Print the vector elements
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    // Method to read a number from the console
    public static int citesteNr() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
}*/

//matrice citire tastatura si afisare program
public class Tablou {
    public static void main(String[] args) throws IOException {
      
        System.out.println("Introduceti numarul de randuri: ");
        int rows = citesteNr();
        
       
        System.out.println("Introduceti numarul de coloane: ");
        int cols = citesteNr();
        
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Introduceti elementele matricei: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = citesteNr();
            }
        }
        
        System.out.println("Elementele matricei sunt: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int citesteNr() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
}
