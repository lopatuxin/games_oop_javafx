package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BishopBlackTest {

    @Test
    public void whenPositionB8() {
        BishopBlack black = new BishopBlack(Cell.B8);
        assertEquals(Cell.B8, black.position());
    }

    @Test
    public void whenCopyB8() {
        BishopBlack black = new BishopBlack(Cell.B8);
        assertEquals(Cell.B8, black.copy(Cell.B8).position());
    }

    @Test
    public void whenWayTrue() {
        BishopBlack black = new BishopBlack(Cell.C1);
        Cell[] cells = black.way(Cell.G5);
        Cell[] expect = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expect, cells);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayFalse()
        throws ImpossibleMoveException {
        BishopBlack black = new BishopBlack(Cell.C1);
        Cell[] cells = black.way(Cell.E2);
        Cell[] expect = {Cell.C1, Cell.E2};
        assertArrayEquals(expect, cells);
    }
}