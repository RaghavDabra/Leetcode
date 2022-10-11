NUMERAL_INT_MAP = {
    "I" => 1,
    "V" => 5,
    "X" => 10,
    "L" => 50,
    "C" => 100,
    "D" => 500,
    "M" => 1000
}

def int_for_numeral(numeral)
    NUMERAL_INT_MAP[numeral]
end

# @param {String} s
# @return {Integer}
def roman_to_int(s)
    numerals = s.split("")
    process_number(numerals[0], numerals[1..])
end

def process_number(head, tail)
    head = int_for_numeral(head)
    
    if tail.nil?
        return head
    elsif head < int_for_numeral(tail[0]).to_i
        return (-head) + process_number(tail.first, tail[1..])
    else
        return head + process_number(tail.first, tail[1..]).to_i
    end
end