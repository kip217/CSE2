import java.util.Random;

public class Crossword {

    public static void main(String[] args) {
        
        // words that go in the puzzle
        String[] words = {"IMAGINATIVE", "AMBITIOUS", "ORGANIZED", "THOROUGH",
                          "DETERMINED", "RESPONSIBLE", "RESPECTFUL", "INDEPENDENT", 
                          "DISCIPLINED", "TALENTED", "RELIABLE", "HONEST"};
        
        // directions that the words will go                  
        String[] directions = {"up", "down", "left", "right", "diagonalDownRight", "diagonalUpRight", "diagonalDownLeft", "diagonalUpLeft"};
        
        int boundary = 30;
        char[][] puzzle = new char[boundary][boundary];
        
        // create and print puzzle
        initializePuzzle(puzzle);
        createPuzzle(boundary, directions, words, puzzle);
        initializeTheRest(puzzle);
        printPuzzle(puzzle, words);  
    }
    
    // initialize every character to '.'
    public static void initializePuzzle(char[][] puzzle) {
        for (int row = 0; row < puzzle.length; row++) {
            for (int col = 0; col < puzzle[row].length; col++) {
                    puzzle[row][col] = '.';
            }
        } 
    }
    
    // place words
    public static void createPuzzle(int bound, String[] directions, String[] words, char[][] puzzle) {
        
        for (int index = 0; index < words.length; index++) {
            
            // get random direction
            int dir = (int) (Math.random() * directions.length);
            int wordLength = words[index].length();
            String successful;
            
            switch(directions[dir]) {
                case "up":
                    successful = up(index, bound, wordLength, words, puzzle);
                    if (successful.equals("unsuccessful")) {
                        index--;
                    }
                    break;
                case "down":
                    successful = down(index, bound, wordLength, words, puzzle);
                    if (successful.equals("unsuccessful")) {
                        index--;
                    }
                    break;
                case "left":
                    successful = left(index, bound, wordLength, words, puzzle);
                    if (successful.equals("unsuccessful")) {
                        index--;
                    }
                    break;
                case "right":
                    successful = right(index, bound, wordLength, words, puzzle);
                    if (successful.equals("unsuccessful")) {
                        index--;
                    }
                    break;
                case "diagonalDownRight":
                    successful = diagonalDownRight(index, bound, wordLength, words, puzzle);
                    if (successful.equals("unsuccessful")) {
                        index--;
                    }
                    break;
                case "diagonalUpRight":
                    successful = diagonalUpRight(index, bound, wordLength, words, puzzle);
                    if (successful.equals("unsuccessful")) {
                        index--;
                    }
                    break;
                case "diagonalDownLeft":
                    successful = diagonalDownLeft(index, bound, wordLength, words, puzzle);
                    if (successful.equals("unsuccessful")) {
                        index--;
                    }
                    break;
                case "diagonalUpLeft":
                    successful = diagonalUpLeft(index, bound, wordLength, words, puzzle);
                    if (successful.equals("unsuccessful")) {
                        index--;
                    }
                    break;
            }
        }
    }
    
    // place word in the up direction
    public static String up(int word, int bound, int wordLength, String[] words, char[][] puzzle) {
        
        // get boundaries
        int boundUp = bound - wordLength;
        int boundLeft = bound;
        int indexUp;
        int indexLeft;
            
        // get starting coordinate for word
        indexUp = (int) (Math.random() * boundUp);
        indexLeft = (int) (Math.random() * boundLeft);
            
        // check to see if the word can be placed    
        for (int wordInd = 0; wordInd < words[word].length(); wordInd++) {
            char currentChar = words[word].charAt(wordInd);
            if (puzzle[indexUp + wordInd][indexLeft] == '.') {
            } else {
                return "unsuccessful";
            }
        }
        
        // place word
        for (int wordInd = 0; wordInd < words[word].length(); wordInd++) {
            char currentChar = words[word].charAt(wordInd);
            puzzle[indexUp + wordInd][indexLeft] = currentChar;
        }
        return "successful";
    }
    
    // place word in the down direction
    public static String down(int word, int bound, int wordLength, String[] words, char[][] puzzle) {
        
        // get boundaries
        int boundUp = bound - wordLength;
        int boundLeft = bound;
        int indexUp;
        int indexLeft;
            
        // get starting coordinate for word
        indexUp = (int) (Math.random() * boundUp);
        indexLeft = (int) (Math.random() * boundLeft);
            
        // check to see if the word can be placed    
        for (int wordInd = 0; wordInd < words[word].length(); wordInd++) {
            char currentChar = words[word].charAt(wordInd);
            if (puzzle[indexUp + wordInd][indexLeft] == '.') {
            } else {
                return "unsuccessful";
            }
        }
        
        // place word
        int wordInd = words[word].length() - 1;
        int wordInd2 = 0;
        while ((wordInd >= 0) && (wordInd2 < words[word].length())) {
            char currentChar = words[word].charAt(wordInd);
            puzzle[indexUp + wordInd2][indexLeft] = currentChar;
            wordInd--;
            wordInd2++;
        }
        return "successful";
    }

    // place word in the left direction
    public static String left(int word, int bound, int wordLength, String[] words, char[][] puzzle) {
        
        // get boundaries
        int boundUp = bound;
        int boundLeft = bound - wordLength;
        int indexUp;
        int indexLeft;
            
        // get starting coordinate for word
        indexUp = (int) (Math.random() * boundUp);
        indexLeft = (int) (Math.random() * boundLeft);
            
        // check to see if the word can be placed    
        for (int wordInd = 0; wordInd < words[word].length(); wordInd++) {
            char currentChar = words[word].charAt(wordInd);
            if (puzzle[indexUp][indexLeft + wordInd] == '.') {
            } else {
                return "unsuccessful";
            }
        }
        
        // place word
        for (int wordInd = 0; wordInd < words[word].length(); wordInd++) {
            char currentChar = words[word].charAt(wordInd);
            puzzle[indexUp][indexLeft + wordInd] = currentChar;
        }
        return "successful";
    }

    // place word in the right direction
    public static String right(int word, int bound, int wordLength, String[] words, char[][] puzzle) {
        
        // get boundaries
        int boundUp = bound;
        int boundLeft = bound - wordLength;
        int indexUp;
        int indexLeft;
            
        // get starting coordinate for word
        indexUp = (int) (Math.random() * boundUp);
        indexLeft = (int) (Math.random() * boundLeft);
            
        // check to see if the word can be placed    
        for (int wordInd = 0; wordInd < words[word].length(); wordInd++) {
            char currentChar = words[word].charAt(wordInd);
            if (puzzle[indexUp][indexLeft + wordInd] == '.') {
            } else {
                return "unsuccessful";
            }
        }
        
        // place word
        int wordInd = words[word].length() - 1;
        int wordInd2 = 0;
        while ((wordInd >= 0) && (wordInd2 < words[word].length())) {
            char currentChar = words[word].charAt(wordInd);
            puzzle[indexUp][indexLeft + wordInd2] = currentChar;
            wordInd--;
            wordInd2++;
        }
        return "successful";
    }
    
    // place word in the diagonal-down-right direction
    public static String diagonalDownRight(int word, int bound, int wordLength, String[] words, char[][] puzzle) {
        
        // get boundaries
        int boundUp = bound - wordLength;
        int boundLeft = bound - wordLength;
        int indexUp;
        int indexLeft;
            
        // get starting coordinate for word
        indexUp = (int) (Math.random() * boundUp);
        indexLeft = (int) (Math.random() * boundLeft);
            
        // check to see if the word can be placed    
        for (int wordInd = 0; wordInd < words[word].length(); wordInd++) {
            char currentChar = words[word].charAt(wordInd);
            if (puzzle[indexUp + wordInd][indexLeft + wordInd] == '.') {
            } else {
                return "unsuccessful";
            }
        }
        
        // place word
        for (int wordInd = 0; wordInd < words[word].length(); wordInd++) {
            char currentChar = words[word].charAt(wordInd);
            puzzle[indexUp + wordInd][indexLeft + wordInd] = currentChar;
        }
        return "successful";
    }
    
    // place word in the diagonal-up-right direction
    public static String diagonalUpRight(int word, int bound, int wordLength, String[] words, char[][] puzzle) {
        
        // get boundaries
        int boundUp = bound - wordLength;
        int boundLeft = bound - wordLength;
        int indexUp;
        int indexLeft;
            
        // get starting coordinate for word
        indexUp = (int) (Math.random() * boundUp);
        indexLeft = (int) (Math.random() * boundLeft);
            
        // check to see if the word can be placed    
        for (int wordInd = 0; wordInd < words[word].length(); wordInd++) {
            char currentChar = words[word].charAt(wordInd);
            if (puzzle[indexUp + wordInd][indexLeft + wordInd] == '.') {
            } else {
                return "unsuccessful";
            }
        }
        
        // place word
        int wordInd = words[word].length() - 1;
        int wordInd2 = 0;
        while ((wordInd >= 0) && (wordInd2 < words[word].length())) {
            char currentChar = words[word].charAt(wordInd);
            puzzle[indexUp + wordInd2][indexLeft + wordInd] = currentChar;
            wordInd--;
            wordInd2++;
        }
        return "successful";
    }
    
    // place word in the diagonal-down-left direction
    public static String diagonalDownLeft(int word, int bound, int wordLength, String[] words, char[][] puzzle) {
        
        // get boundaries
        int boundUp = bound - wordLength;
        int boundLeft = bound - wordLength;
        int indexUp;
        int indexLeft;
            
        // get starting coordinate for word
        indexUp = (int) (Math.random() * boundUp);
        indexLeft = (int) (Math.random() * boundLeft);
            
        // check to see if the word can be placed 
        int wordInd = words[word].length() - 1;
        int wordInd2 = 0;
        while ((wordInd >= 0) && wordInd2 < (words[word].length())) {
            char currentChar = words[word].charAt(wordInd);
            if (puzzle[indexUp + wordInd][indexLeft + wordInd2] == '.') {
            } else {
                return "unsuccessful";
            }
            wordInd--;
            wordInd2++;
        }
        
        // place word
        wordInd = words[word].length() - 1;
        wordInd2 = 0;
        while ((wordInd >= 0) && wordInd2 < (words[word].length())) {
            char currentChar = words[word].charAt(wordInd);
            puzzle[indexUp + wordInd][indexLeft + wordInd2] = currentChar;
            wordInd--;
            wordInd2++;
        }
        return "successful";
    }
    
    // place word in the diagonal-up-left direction
    public static String diagonalUpLeft(int word, int bound, int wordLength, String[] words, char[][] puzzle) {
        
        // get boundaries
        int boundUp = bound - wordLength;
        int boundLeft = bound - wordLength;
        int indexUp;
        int indexLeft;
            
        // get starting coordinate for word
        indexUp = (int) (Math.random() * boundUp);
        indexLeft = (int) (Math.random() * boundLeft);
            
        // check to see if the word can be placed 
        int wordInd = words[word].length() - 1;
        int wordInd2 = 0;
        while ((wordInd >= 0) && wordInd2 < (words[word].length())) {
            char currentChar = words[word].charAt(wordInd);
            if (puzzle[indexUp + wordInd2][indexLeft + wordInd2] == '.') {
            } else {
                return "unsuccessful";
            }
            wordInd--;
            wordInd2++;
        }
        
        // place word
        wordInd = words[word].length() - 1;
        wordInd2 = 0;
        while ((wordInd >= 0) && wordInd2 < (words[word].length())) {
            char currentChar = words[word].charAt(wordInd);
            puzzle[indexUp + wordInd2][indexLeft + wordInd2] = currentChar;
            wordInd--;
            wordInd2++;
        }
        return "successful";
    }
    
    // make the rest of the letters in the puzzle random letters
    public static void initializeTheRest(char[][] puzzle) {
        for (int row = 0; row < puzzle.length; row++) {
            for (int col = 0; col < puzzle[row].length; col++) {
                if (puzzle[row][col] == '.') {
                    Random rand = new Random();
                    char letter = (char) (rand.nextInt(26) + 'A');
                    puzzle[row][col] = letter;
                }
            }
        }
    }
    
    // print the puzzle
    public static void printPuzzle(char[][] puzzle, String[] words) {
        System.out.print("\n\n\t\tCrossword Puzzle!\n\n");
        
        // print crossword puzzle
        for (int row = 0; row < puzzle.length; row++) {
            for (int col = 0; col < puzzle[row].length; col++) {
                System.out.print(puzzle[row][col] + " ");
            }
            System.out.print("\n");
        }
        
        // print words to look for
        System.out.print("\nWords:\n\n");
        for (int num = 0; num < words.length; num++) {
            System.out.print(words[num] + "\t");
            if (((num + 1) % 3) == 0) {
                System.out.print("\n");
            }
        }
    }
    
}
