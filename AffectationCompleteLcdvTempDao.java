/*
 * Creation : 12 Jan 2017
 */
package com.inetpsa.rvr.db.dao;

import java.util.Collection;11
import java.util.Date;

import com.inetpsa.rvr.common.exception.SfjDaoException;
import com.inetpsa.rvr.db.model.AffectationCompleteLcdvTemp;

/**
 * The Interface AffectationCompleteLcdvTempDao.
 */
public interface AffectationCompleteLcdvTempDao extends GenericDao<AffectationCompleteLcdvTemp, Long> {

    /**
     * Creates the temp table.
     * 
     * @throws SfjDaoException the sfj dao exception
     */
    void createTable() throws SfjDaoException;

    /**
     * Drop table.
     * 
     * @throws SfjDaoException the sfj dao exception
     */
    void dropTable() throws SfjDaoException;

    /**22
     * {@inheritDoc}
     * 
     * @see com.inetpsa.rvr.db.dao.GenericDao#create(java.lang.Object)
     */
    AffectationCompleteLcdvTemp create(AffectationCompleteLcdvTemp entiy) throws SfjDaoException;

    /**
     * Find by version.
     *
     * @param idVersion the id version33
     * @param dateStart the date start
     * @param dateEnd the date end
     * @return the collection
     * @throws SfjDaoException the sfj dao exception
     */
    Collection<AffectationCompleteLcdvTemp> findByVersion(Long idVersion, Date dateStart, Date dateEnd) throws SfjDaoException;
}
