package com.example.nhomspring.service.Impl;

import com.example.nhomspring.model.Position;
import com.example.nhomspring.repository.PositionRepository;
import com.example.nhomspring.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;

    @Override
    public List<Position> getAllPosition() {
        return positionRepository.findAll();
    }

    @Override
    public void addPosition(Position position) {
         positionRepository.save(position);
    }

    @Override
    public void deletePosition(int id) {
       positionRepository.deleteById(id);
    }

    @Override
    public Position updatePosition(Position position) {
         return positionRepository.save(position);
    }

    @Override
    public Position getPositionById(Integer id) {
        return positionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("position not found"));
    }
}
