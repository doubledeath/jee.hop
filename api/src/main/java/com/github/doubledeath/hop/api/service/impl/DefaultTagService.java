package com.github.doubledeath.hop.api.service.impl;

import com.github.doubledeath.hop.api.service.TagService;

import javax.ejb.Stateless;

/**
 * Created by doubledeath on 4/03/17.
 */
@SuppressWarnings("unused")
@Stateless(name = "default")
public class DefaultTagService extends NumberTagService implements TagService {

    public DefaultTagService() {
        super(5L);
    }

}
