package com.wang.clouddemo.demo.service;

import com.wang.clouddemo.demo.repository.OrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class OrderInfoService {
/*    @Autowired
    OrderInfoRepository orderInfoRepository;*/
    @Autowired
    private OrderInfoRepository orderInfoRepository;

    public List<Map<String ,Object>> findUserByOid(Integer oid){
        return orderInfoRepository.findUserByOid(oid);
    }

    public List<Map<String ,Object>> findProductByOid(Integer oid){
        return orderInfoRepository.findProductByOid(oid);
    }

    public List<Map<String ,Object>> findInfoByOid(Integer oid){
     return orderInfoRepository.findInfoByOid(oid);
    }



}
