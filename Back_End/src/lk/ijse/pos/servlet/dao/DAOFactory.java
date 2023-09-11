package lk.ijse.pos.servlet.dao;

import lk.ijse.pos.servlet.dao.custom.impl.CustomerDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOFactory(){}

    public static DAOFactory getInstance(){
        return daoFactory == null ? new DAOFactory() : daoFactory;
    }

    public enum DAOTYpes{
        CUSTOMER
    }

    public SuperDAO getDAO(DAOTYpes types){
        switch (types){
            case CUSTOMER:
                return new CustomerDAOImpl();
            default:
                return null;
        }

    }
}
