(ns clj_chesslib.board_test
  (:use clj_chesslib.board))

(deftest test-empty-board
  (testing "empty board constructor"
    (let [board (empty-board)]
      (is (= 64 (count (:board board))))
      (is (= false (:q board)))
      (is (= false (:Q board)))
      (is (= false (:k board)))
      (is (= false (:K board)))
      (is (= 0 (:moves board)))
      (is (= 0 (:since board)))
      (is (= -1 (:enpassant board))))))

(deftest test-initial-board
  (testing "initial-board constructor"
    (let [board (initial-board)]
      (is (= "R" (get-piece board "a1")))
      (is (= "N" (get-piece board "b1")))
      (is (= "B" (get-piece board "c1")))
      (is (= "Q" (get-piece board "d1")))
      (is (= "K" (get-piece board "e1")))
      (is (= "B" (get-piece board "f1")))
      (is (= "N" (get-piece board "g1")))
      (is (= "P" (get-piece board "a2")))
      (is (= "P" (get-piece board "b2")))
      (is (= "P" (get-piece board "c2")))
      (is (= "P" (get-piece board "d2")))
      (is (= "P" (get-piece board "e2")))
      (is (= "P" (get-piece board "f2")))
      (is (= "P" (get-piece board "g2")))
      (is (= "P" (get-piece board "h2")))
      (is (= nil (get-piece board "e4")))
      (is (= "r" (get-piece board "a8"))) 
      (is (= "n" (get-piece board "b8"))) 
      (is (= "b" (get-piece board "c8"))) 
      (is (= "q" (get-piece board "d8"))) 
      (is (= "k" (get-piece board "e8"))) 
      (is (= "b" (get-piece board "f8"))) 
      (is (= "n" (get-piece board "g8"))) 
      (is (= "r" (get-piece board "h8"))) 
      (is (= "p" (get-piece board "a7")))
      (is (= "p" (get-piece board "b7")))
      (is (= "p" (get-piece board "c7")))
      (is (= "p" (get-piece board "d7")))
      (is (= "p" (get-piece board "e7")))
      (is (= "p" (get-piece board "f7")))
      (is (= "p" (get-piece board "g7")))
      (is (= "p" (get-piece board "h7"))))))

