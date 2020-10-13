## Paimon Prayers!

Simple Java API that returns random rewards from genshin impact prayers.

### Technologies

- Java 1.8;
- Springboot Webflux;
- Springdata MongoDB Reactive;
- MongoDB.

### Endpoints

**POST** request to create a reward - _/rewards_

    {
        "name": "Mona",
        "rating": 5  
    }
      
**GET** request to list all rewards - _/rewards_

**GET** request to pray for random rewards, insert the reward's quantity value as a parameter, in this example the value is 2. - _/pray?quantity={quantityValue}_

    [
        {
            "id": "5f851dd497ad2a41b2d9f7ec",
            "name": "Mona",
            "rating": 5
        },
        {
            "id": "5f851db297ad2a41b2d9f7e5",
            "name": "Ningguang",
            "rating": 4
        }
    ]
    
### Future Improvements
- Add probability values to rewards and logic to service;
- Massive improvement to error handling, if you insert anything out of the ordinary the API go BOOM.
