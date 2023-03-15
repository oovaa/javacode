#! /bin/bash
beast=$(($RANDOM % 2))
echo "ATTTACK !! (0/1)"
read plyer
win
if [[ $plyer == $beast ]]; then
    echo "u killed the beast"
    win=true
elif [[ $beast != $plyer ]]; then
    echo "beast killed the u"
    exit 1
fi
if [[ $win ]]; then
    echo "time for the second beast"
    beast=$(($RANDOM % 5))
    plyer= read -p "ATTTACK !! (0/4)"

    if [[ $plyer == $beast ]]; then
        echo "u killed the beast"
        win=true
    elif [[ $beast != $plyer ]]; then
        echo "beast killed the u"
        echo $beast
        exit 1
    fi

fi
if [[ $win ]]; then
    echo "time for the thired beast"
    beast=$(($RANDOM % 10))
    plyer= read -p "ATTTACK !! (0/9)"

    if [[ $plyer == $beast ]]; then
        echo "u killed the beast"
        win=true
    elif [[ $beast != $plyer ]]; then
        echo "beast killed the u"
        echo $beast
        exit 1
    fi

fi