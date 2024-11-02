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

}
