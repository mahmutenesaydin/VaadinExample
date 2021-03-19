package com.uniyaz.core.service;

import com.uniyaz.core.dao.IcerikDao;
import com.uniyaz.core.domain.Icerik;

import java.util.List;

public class IcerikService
{
    IcerikDao icerikDao = new IcerikDao();

    public void addIcerik(Icerik icerik)
    {
        icerikDao.addIcerik(icerik);
    }

    public List<Icerik> icerikList()
    {
        return icerikDao.listIcerik();
    }
}
