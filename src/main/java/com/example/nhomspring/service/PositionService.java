package com.example.nhomspring.service;

import com.example.nhomspring.model.Position;

import java.util.List;

public interface PositionService {
    public List<Position> getAllPosition();
    public void addPosition(Position position);
    public void deletePosition(int id);
    public Position updatePosition(Position position);
    public Position getPositionById(Integer id);

}
