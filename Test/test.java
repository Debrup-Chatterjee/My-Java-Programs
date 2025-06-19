import java.util.Scanner;

public class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[][] matrix = new char[5][5];

        // Read the 5×5 matrix row by row
        for (int i = 0; i < 5; i++) {
            String line = sc.nextLine().trim(); // Read the whole line & trim spaces
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = line.charAt(j); // Store character by character
            }
        }
        sc.close();

        // Initialize rotated matrix with '0' (same as input format)
        char[][] rotated = {
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };

        int mid = 2; // Center index remains unchanged
        rotated[mid][mid] = matrix[mid][mid]; // Keep the center same

        // Correct Mapping for 45° Anti-clockwise Rotation
        rotated[0][0] = matrix[0][2]; // Top Middle → Top-Left
        rotated[1][1] = matrix[1][1]; // Upper Left → Upper Mid-Left
        rotated[1][3] = matrix[1][3]; // Upper Right → Upper Mid-Right
        rotated[2][0] = matrix[2][0]; // Left Middle → Mid-Left
        rotated[2][4] = matrix[2][4]; // Right Middle → Mid-Right
        rotated[3][1] = matrix[3][1]; // Lower Left → Lower Mid-Left
        rotated[3][3] = matrix[3][3]; // Lower Right → Lower Mid-Right
        rotated[4][4] = matrix[4][2]; // Bottom Middle → Bottom-Right

        // Print the rotated matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(rotated[i][j]);
            }
            System.out.println();
        }
    }
}
