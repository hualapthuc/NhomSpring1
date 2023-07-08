package com.example.nhomspring.service;

import com.example.nhomspring.model.Position;

import java.util.List;

public interface PositionService {
    public List<Position> getAllPosition();
    public Position addPosition(Position position);
    public void deletePosition(int id);
    public void updatePosition(Position position);
}
