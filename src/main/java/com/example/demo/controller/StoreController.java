REquirements for service
createStore(Store store):Check duplicate name
getStoreByID(Long id):Throw exception if not found
getAllStores()

requirement for model
store name must be unique
id(long,pk),storeName(stirng,unique,required),address(string),region(string),active(boolean,default true)

requirements for controller(/api/stores)
post/-create store
get