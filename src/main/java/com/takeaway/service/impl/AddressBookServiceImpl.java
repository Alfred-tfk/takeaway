package com.takeaway.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.takeaway.entity.AddressBook;
import com.takeaway.mapper.AddressBookMapper;
import com.takeaway.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
