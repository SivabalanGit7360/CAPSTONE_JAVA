package com.colorcatalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.colorcatalog.model.ColorSelection;
import com.colorcatalog.repository.ColorSelectionRepository;

import java.util.List;

@Service
public class ColorService {

    @Autowired
    private ColorSelectionRepository colorSelectionRepository;

    public void saveColors(String username, List<String> colors) {
        ColorSelection colorSelection = new ColorSelection();
        colorSelection.setUsername(username);
        colorSelection.setColors(String.join(",", colors));
        colorSelectionRepository.save(colorSelection);
    }
}
