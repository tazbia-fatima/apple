package dao;

import models.FoodIntake;
import play.Logger;
import play.db.jpa.JPAApi;


import javax.inject.Inject;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class FoodIntakeDaoImpl implements FoodIntakeDao {

    private final static Logger.ALogger LOGGER = Logger.of(FoodIntakeDaoImpl.class);

    final JPAApi jpaApi;


    @Inject
    public FoodIntakeDaoImpl(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }

    public FoodIntake create(FoodIntake intake) {

        if (null == intake) {
            throw new IllegalArgumentException("Intake must be provided");
        }

        jpaApi.em().persist(intake);
        return intake;
    }

    @Override
    public Optional<FoodIntake> read(Integer Id) {
        if(null == Id){
            throw new IllegalArgumentException("Id must be provided");
        }

        final FoodIntake intake = jpaApi.em().find(FoodIntake.class, Id);
        return intake != null ? Optional.of(intake) : Optional.empty();
    }

    @Override
    public FoodIntake update(FoodIntake intake) {
        if(null == intake){
            throw new IllegalArgumentException("Food must be provided");
        }

        if(null == intake.getId()){
            throw new IllegalArgumentException("Food Id must be provided");
        }

        final FoodIntake existingFoodIntake = jpaApi.em().find(FoodIntake.class, intake.getId());
        if(null == existingFoodIntake) {
            return null;
        }
        existingFoodIntake.setQuantity(intake.getQuantity());

        jpaApi.em().persist(existingFoodIntake);

        return existingFoodIntake;
    }

    @Override
    public FoodIntake delete(Integer Id) {
        if(null == Id) {
            throw new IllegalArgumentException("Food Id must be provided");
        }

        final FoodIntake existingFoodIntake = jpaApi.em().find(FoodIntake.class, Id);
        if(null == existingFoodIntake) {
            return null;
        }

        jpaApi.em().remove(existingFoodIntake);
        return existingFoodIntake;
    }

    @Override
    public Collection<FoodIntake> all() {
        TypedQuery<FoodIntake> query = jpaApi.em().createQuery("SELECT f FROM FoodIntake f", FoodIntake.class);
        List<FoodIntake> intakes = query.getResultList();

        return intakes;
    }

    @Override
    public Collection<FoodIntake> createFoodIntake(Collection<FoodIntake> intakes) {
        for(FoodIntake item: intakes){
            jpaApi.em().persist(item);
        }

        return intakes;
    }
}
