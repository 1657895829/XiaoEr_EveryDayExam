package com.dhw.greendao_retrofit.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.dhw.greendao_retrofit.bean.NewslistBean;
import com.dhw.greendao_retrofit.bean.User;

import com.dhw.greendao_retrofit.dao.NewslistBeanDao;
import com.dhw.greendao_retrofit.dao.UserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig newslistBeanDaoConfig;
    private final DaoConfig userDaoConfig;

    private final NewslistBeanDao newslistBeanDao;
    private final UserDao userDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        newslistBeanDaoConfig = daoConfigMap.get(NewslistBeanDao.class).clone();
        newslistBeanDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        newslistBeanDao = new NewslistBeanDao(newslistBeanDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);

        registerDao(NewslistBean.class, newslistBeanDao);
        registerDao(User.class, userDao);
    }
    
    public void clear() {
        newslistBeanDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
    }

    public NewslistBeanDao getNewslistBeanDao() {
        return newslistBeanDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

}
