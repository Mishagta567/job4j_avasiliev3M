package ru.job4j.storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.job4j.models.CarAd;
import java.util.List;
import java.util.Objects;
//import static ru.job4j.services.ConstantKeep.CHOOSE_ALL;
//import static ru.job4j.services.ConstantKeep.NOINDB;

/**
 * @author Aleksundrr Vahheedofv (mailto:mango777555@hotmail.com)
 * @since 2018
 */
@Repository
public class DbStorage {

    @Autowired
    private HibernateTemplate template;


    public List<CarAd> getAllCars() {
        List<?> list = this.template.find("FROM CarAd");
        return (List<CarAd>) list;
    }

    @Transactional
    public void saveCar(CarAd carAd) {
        this.template.save(carAd);
    }



}
