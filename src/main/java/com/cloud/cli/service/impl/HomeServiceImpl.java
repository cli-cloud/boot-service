package com.cloud.cli.service.impl;

import com.cloud.cli.service.HomeService;
import com.cloud.cli.dao.HomeDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 首页内容管理Service实现类
 * Created by macro on 2019/1/28.
 */
@Service
@RequiredArgsConstructor
public class HomeServiceImpl implements HomeService {

    private final HomeDao homeDao;

    @Override
    public List<String> getHomeContent() {
        return List.of();
    }
}
