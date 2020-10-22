/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Admin
 */



@RestController
@ConditionalOnExpression("${my.controller.enabled:false}")
@RequestMapping(value = "foo", produces = "application/json;charset=UTF-8")
public class MyController {
    @RequestMapping(value = "bar")
    public ResponseEntity<String> bar(
        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }
}