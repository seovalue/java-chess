package chess.view;

import chess.domain.board.Board;
import chess.util.ConsoleOutputRenderer;

public class OutputView {
	private OutputView() {
	}

	public static void printStartMessage() {
		System.out.println("> 체스 게임을 시작합니다.\n"
			+ "> 게임 시작 : start\n"
			+ "> 게임 종료 : end\n"
			+ "> 게임 이동 : move source위치 target위치 - 예. move b2 b3");
	}

	public static void printBoard(Board board) {
		System.out.println(ConsoleOutputRenderer.renderBoard(board));
	}
}
