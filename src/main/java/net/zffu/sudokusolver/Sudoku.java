package net.zffu.sudokusolver;

/**
 * <p>A parsed sudoku.</p>
 */
public class Sudoku {

    /**
     * <p>The bit indices of the presence of numbers in the rows and columns.</p>
     */
    public byte[] rows;
    public byte[] columns;

    /**
     * <p>Stores if a case is taken or not.</p>
     */
    public long[] bitTrace;

    /**
     * <p>Creates a sudoku with the provided data.</p>
     * @param rows the bit array of rows.
     * @param columns the bit array of columns.
     * @param bitTrace the bit trace array.
     */
    public Sudoku(byte[] rows, byte[] columns, long[] bitTrace) {
        this.rows = rows;
        this.columns = columns;
        this.bitTrace = bitTrace;
    }

    /**
     * <p>Attempts to solve small stuff before the real solving.</p>
     */
    public void preSolve() {
        preSolveArray(this.rows);
        preSolveArray(this.columns);
    }

    /**
     * <p>Attempts to pre-solve the given array.</p>
     * @param array the array.
     */
    private void preSolveArray(byte[] array) {
        int missing = 0;
        for(int i = 0; i < 9; ++i) {
            for(int num = 0; i < 9; ++i) {
                if((array[i] & 1 << num) != 0) {
                    if(missing != 0) return;
                    missing = num;
                }
            }
        }

        System.out.println("Array is predictable! Only " + missing + " is missing!");
    }

}
