package com.dextracodes.propertymgt.controller;

import com.dextracodes.propertymgt.model.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    //localhost:8082/api/v1/calculator/add?num1=2.3&num2=3.4
    @GetMapping("/add")
    public double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2){
        return num1 + num2;
    }

    //It is also possible to combine pathvariable and requestparam
    @GetMapping("/sub/{num1}/{num2}")
    public double subtract(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2){
        Double result = null;
        if(num1 > num2){
            result = num1 - num2;
        }
        else {
            result = num2 - num1;
        }
        return result;
    }
    //When the URL is getting longer, then it is better to use another method
    @PostMapping("/mul")
    //public Double multiply(@RequestBody CalculatorDTO calculatorDTO){
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDTO calculatorDTO){
        Double result = null;
        result = calculatorDTO.getNum1() * calculatorDTO.getNum2() * calculatorDTO.getNum3() * calculatorDTO.getNum4();
        //Formatting the response with custom HTTP status
        ResponseEntity<Double> responseEntity = new ResponseEntity<Double>(result, HttpStatus.CREATED);
        //return result;
        return responseEntity;
    }
}
