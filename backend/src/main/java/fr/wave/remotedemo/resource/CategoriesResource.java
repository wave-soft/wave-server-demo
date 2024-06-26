package fr.wave.remotedemo.resource;

import fr.wave.remotedemo.dto.EnumDTO;
import fr.wave.remotedemo.enums.Category;
import fr.wave.remotedemo.transformer.EnumTransformer;
import fr.wave.remotedemo.utils.EndpointsUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = {EndpointsUtils.COMPETITIONS_CATEGORIES, EndpointsUtils.CATEGORIES})
@RequiredArgsConstructor
public class CategoriesResource {

    @GetMapping()
    public List<EnumDTO> getCategories() {
        return Arrays.stream(Category.values()).map(EnumTransformer::toDTO).toList();
    }
}
