function countParkingLot(lot) {
    let lotCount = 0;

    for (let row = 0; row < lot.length; row++) {
        for (let column = 0; column < lot[row].length; column++) {
            lotCount++;
        }
    }

    return lotCount;
}

function checkAllLotIsEmptyAtDayStart(lot) {
    let emptyLotCount = 0;
    let length = countParkingLot(lot);

    for (let row = 0; row < lot.length; row++) {
        for (let column = 0; column < lot[row].length; column++) {
            if (lot[row][column] === 0) emptyLotCount++;
        }
    }

    return length === emptyLotCount;
}


function parkACarBySequence(lot, command) {
    if (!command || command.toLowerCase() !== "assign") {
        return lot;
    }

    for (let row = 0; row < lot.length; row++) {
        for (let column = 0; column < lot[row].length; column++) {
            if (lot[row][column] === 0) {
                lot[row][column] = 1;
                return lot;
            }
        }
    }

    return lot;
}

function parkCarByLotNumber(lot, lotNumber, command) {
    lotNumber = lotNumber - 1;

    if (lotNumber <= 0) {
        return lot;
    } else if (lotNumber > 0 && lotNumber <= 9 && command.toLowerCase() === "assign") {
        lot[0][lotNumber] = 1;
        return lot;
    } else {
        let row = Math.floor(lotNumber / 10);
        let col = lotNumber % 10;
        lot[row][col] = 1;

        return lot;
    }
}

function unparkCarByLotNumber(lot, lotNumber, command) {
    lotNumber = lotNumber - 1;

    if (lotNumber <0) {
        return lot;
    } else if (lotNumber >=0 && lotNumber <= 9 && command.toLowerCase() === "unassign") {

        if (lot[0][lotNumber] === 1) {
            lot[0][lotNumber] = 0;
            return lot;
        } else {
            return lot;
        }

    } else {
        let row = Math.floor(lotNumber / 10);
        let col = lotNumber % 10;

        if (lot[row][col] === 1) {
            lot[row][col] = 0;
        }

        return lot;
    }
}

module.exports={

countParkingLot,
checkAllLotIsEmptyAtDayStart,
parkACarBySequence,
parkCarByLotNumber,
unparkCarByLotNumber,

};
