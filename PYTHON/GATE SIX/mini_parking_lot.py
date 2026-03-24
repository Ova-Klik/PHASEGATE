

def count_parking_lot(lot):
    
    length = len(lot);
    count = 0;
    for index in lot:
        count+=1;
        
    return (count);

def check_all_lot_is_empty(lot):
    length=count_parking_lot(lot);
    count_empty_lot=0;
    
    for index in lot:
        if(lot[index]==0):
            count_empty_lot+=1;
        
    return (count_empty_lot==length);
    
def check_that__lot_is_full(lot):
    length=count_parking_lot(lot);
    count_filled_lot=0;
    
    for index in lot:
        if(lot[index]==1):
            count_filled_lot+=1;
        
    return (count_filled_lot==length);
    

def park_a_car_by_sequence(lot):
    length=count_parking_lot(lot);
    count_filled_lot=0;
    
    for index in lot:
        if(lot[index]==1):
            count_filled_lot+=1;
        
    return (count_filled_lot==length);
    

def car_is_parked_by_sequence_when_lot_number_is_not_specified(lot,command):
    command = command.casefold()
    length=count_parking_lot(lot);
    count_filled_lot=0;
    
    if command == None or command=="assign":
        return lot;
    for index in lot:
        if lot[index]==0 and command=="assign":
            lot[index]=1;
        return lot;
        
    return lot;
    
    
    
    
    
