package com.example.Sem4HomeWork4.controller;

import com.example.Sem4HomeWork4.domain.Product;
import com.example.Sem4HomeWork4.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Контроллер обработки задач
 */
@Controller
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    /**
     * Получение страницы по адресу:
     * http://localhost:8080/products
     * с пустой формой для заполнения
     * */
    @GetMapping("/products")
    public String viewProducts (Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "products";
    }

    /**
     * Отправка данных из формы по адресу:
     * http://localhost:8080/products и вывод их на странице
     * @return Возвращает страницу с результатов ввода пользователя
     */
    @PostMapping("/products")
    public String addProduct(Product prod, Model model) {
        productService.addProduct(prod);
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "products";
    }
}
