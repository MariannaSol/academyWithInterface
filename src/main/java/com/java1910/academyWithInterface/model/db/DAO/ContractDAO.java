package com.java1910.academyWithInterface.model.db.DAO;


import com.java1910.academyWithInterface.model.db.entities.Contract;

import java.util.List;

public interface ContractDAO {
    List<Contract> findAll();
    Contract findById(long id);

    boolean save(Contract c);

    boolean delete(Contract c);
}
