package com.cloud.cli.controller;

import com.cloud.cli.service.HomeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * 首页内容管理Controller
 * Created by macro on 2019/1/28.
 */
@Controller
@Tag(name = "HomeController", description = "首页内容管理")
@RequestMapping("/home")
@RequiredArgsConstructor
public class HomeController {

    @Operation(summary = "分页获取新品推荐商品")
    @RequestMapping(value = "/newProductList", method = RequestMethod.GET)
    @ResponseBody
    public String newProductList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                         @RequestParam(value = "pageSize", defaultValue = "6") Integer pageSize) {
        return "newProductList";
    }
}
