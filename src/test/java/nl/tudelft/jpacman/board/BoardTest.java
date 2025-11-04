package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Tests for {@link Board}.
 */
class BoardTest {

    /**
     * Test with a valid 1x1 board (should pass).
     */
    @Test
    void testValidBoard() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();

        Board board = new Board(grid);

        assertThat(board.getWidth()).isEqualTo(1);
        assertThat(board.getHeight()).isEqualTo(1);

        assertThat(board.squareAt(0, 0)).isNotNull();
    }

    /**
     * Test with a board that contains a null square (should fail with AssertionError).
     */
    @Test
    void testBoardWithNullSquare() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;

        assertThrows(AssertionError.class, () -> {
            new Board(grid);
        });
    }
}
