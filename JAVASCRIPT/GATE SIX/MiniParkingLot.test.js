const {
    countParkingLot,
    checkAllLotIsEmptyAtDayStart,
    parkACarBySequence,
    parkCarByLotNumber,
    unparkCarByLotNumber
} = require('./MiniParkingLot'); 


    test('testThatParkingSlotIsUp20', () => {
        const lot = [
            [0,0,0,0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0,0,0,0]];
        const expected = 20;
        const actual = countParkingLot(lot);

        expect(actual).toBe(expected);
    });

    test('testThatAllLotsAtDayStartIsAvailable', () => {
        const lot = [
            [0,0,0,0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0,0,0,0]
        ];
        const expected = true;
        const actual = checkAllLotIsEmptyAtDayStart(lot);

        expect(actual).toBe(expected);
    });

    test('testThatCarAutomaticallyParksAtLot1WhenLotNumberIsNotSpecified', () => {
        const lot = [[0,0,0,0,0,0,0,0,0,0],
                     [0,0,0,0,0,0,0,0,0,0]];
        const command = "assign";

        const expected = [[1,0,0,0,0,0,0,0,0,0],
                          [0,0,0,0,0,0,0,0,0,0]];

        const actual = parkACarBySequence(lot, command);

        expect(actual).toEqual(expected);
    });

    test('testThatCarParksWithLotNumberSpecified', () => {
        
         const lot = [[0,0,0,0,0,0,0,0,0,0],
                     [0,0,0,0,0,0,0,0,0,0]];
        const lotNumber = 10;
        const command = "assign";

        const expected = [[0,0,0,0,0,0,0,0,0,1],
                          [0,0,0,0,0,0,0,0,0,0]];

        const actual = parkCarByLotNumber(lot, lotNumber, command);

        expect(actual).toEqual(expected);
    });

    test('testThatCarCanUnParksWithLotNumberSpecified', () => {
        const lot = [[0,0,0,0,0,0,0,0,0,1],
                     [0,0,0,0,0,0,0,0,0,0]];

        const lotNumber = 10;
        const command = "unassign";

        const expected = [[0,0,0,0,0,0,0,0,0,0],
                        [0,0,0,0,0,0,0,0,0,0]];

        const actual = unparkCarByLotNumber(lot, lotNumber, command);

        expect(actual).toEqual(expected);
    });

   

