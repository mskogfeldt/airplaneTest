package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.TripDao;
import se.mskogfeldt.entity.TripEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class TripDaoImpl implements TripDao {

    // private final TripDao tripDao;
    Map<String, TripEntity> trips = new HashMap<>();

    @Override
    public void createTrip(TripEntity tripEntity) {
        if (trips.containsKey(tripEntity.getId())) {
            throw new RuntimeException("Trip already exists");
        }
        trips.put(tripEntity.getId(), tripEntity);
    }
/*
public void create(Account account) {
        if(accounts.containsKey(account.getId())){
            throw new RuntimeException("Account already exists");
        }
        accounts.put(account.getId(),account);
    }
 */

    /*     public void create(TripEntity tripEntity) {
         trips.put(tripEntity.getName(), airLineEntity);
     }

     public Collection<AirLineEntity> read(String name) {
         return airLines.values().stream().filter(airLineEntity -> airLineEntity.getName().equalsIgnoreCase(name)).collect(Collectors.toSet());
 */
    @Override
    public Optional<TripEntity> readTripEntity(String id) {
        return Optional.ofNullable(trips.get(id));

      /*  Return trips.values().stream().filter(TripEntity -> TripEntity.getId().equalsIgnoreCase(id)).collect(Collectors.toSet());

        //List<FoodEntity> orderdFood = bookedFood.values().stream().filter(customerEntity -> TripEntity.getSsn().equalsIgnoreCase(ssn)).collect(Collectors.toSet());
        */
    }

    public List returnBookdedFood(Map<String, List<String>>data,Integer i){
        if(data.containsKey(i))
            return data.get(i).stream().collect(Collectors.toList());
        return null;
    }public void delitingValues(Map<Integer, List<String>>data,Integer i,List<String> values){
        System.out.println("the value of"+data.get(i)+"is deleted");
        data.remove(i);
        data.put(i,values);
        System.out.println("the new map value"+data.get(i));}
}

}

/*
    public class MapDemo {
       public static void main(String[] args) {
           MapDemo demo=new MapDemo();
           List<String> list = new ArrayList<>();        Map<Integer, List<String>> data = new HashMap<>();
           for (int i = 1; i < 10; i++) {
               list.add("name" + i);
               data.put(i,list);
           }
           System.out.println(list);
           System.out.println("Data: " + data);
           System.out.println("DataEntrySet: "+ data.entrySet());
           System.out.println("Data.values: " + data.values());*/
//System.out.println(demo.returnSmallList(data));
// System.out.println(demo.returnSmallList2(data, 11));
    /*List<String> matslist = Arrays.asList("mats", "biniam");
       demo.delitingValues(data,4,matslist);
               }public List returnSmallList(Map<Integer, List<String>>data){return data.values().stream().collect(Collectors.toList());}
public List returnSmallList2(Map<Integer, List<String>>data,Integer i){
        if(data.containsKey(i))
        return data.get(i).stream().collect(Collectors.toList());
        return null;
        }public void delitingValues(Map<Integer, List<String>>data,Integer i,List<String> values){
        System.out.println("the value of"+data.get(i)+"is deleted");
        data.remove(i);
        data.put(i,values);
        System.out.println("the new map value"+data.get(i));}
        }

        */

