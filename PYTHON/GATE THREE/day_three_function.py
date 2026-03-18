

def modify_length_of_a_given_array(the_list, length):

    new_list=[]
    
    if length<=0: return the_list

    for index in range (0,length,1):
        
        if index<len(the_list):
            
            new_list.append(the_list[index])
        
        else:
            new_list.append(-1)    
            
    return new_list
