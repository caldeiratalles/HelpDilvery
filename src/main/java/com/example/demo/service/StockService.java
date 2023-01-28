package com.example.demo.service;

import com.example.demo.models.Stock;
import com.example.demo.models.UserCreator;
import com.example.demo.models.dto.CategoriaItemDTO;
import com.example.demo.models.dto.CategoriasItemDTO;
import com.example.demo.models.dto.StockDTO;
import com.example.demo.repository.StockRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StockService.class);

    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<StockDTO> findAllPieces() {
        return stockRepository.findAllPieces();
    }

    public StockDTO findByPiece(Integer id) {
        return stockRepository.findByPiece(id);
    }

    public Stock createDonation(Stock stock) {
        LOGGER.info(stock.toString());
        if(stockRepository.createDonation(stock) == 0){
            return null;
        }
        return stock;
    }

    public Stock requestDonation(Stock stock) {
        LOGGER.info(stock.toString());
        if(stockRepository.requestDonation(stock) == 0){
            return null;
        }
        return stock;
    }

    public List<CategoriasItemDTO> categoriaItem() {
        return stockRepository.findCategorias();
    }

    public List<CategoriaItemDTO> findCategoriabyPiece(Integer id) {
        return stockRepository.findCategoriabyPiece(id);
    }

    public Integer deletePeca(Integer id) {
        if(stockRepository.deletePeca(id) == 0){
            return null;
        }
        return id;
    }
}
