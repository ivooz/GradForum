/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gft.grad.forum.service;

import com.gft.grad.forum.model.Board;
import com.gft.grad.forum.model.repo.BoardRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author izielinski
 */
@Service
public class ForumServiceImpl implements ForumService {

    @Autowired
    BoardRepository boardRepository;

    @Override
    public List<Board> obtainBoards() {
        return boardRepository.findAll();
    }

    @Override
    public void addBoard(Board board) {
        boardRepository.save(board);
    }
}
