#!/bin/sh
date_echo() {
    datestamp=$(date "+%F %T")
    echo "${datestamp} $*"
}
loadone() {
  for mailaddr in $2/*json; do
    date_echo "loading $1 with $mailaddr"
    curl "$1" -X POST \
        -H 'Content-Type: application/json' \
        -H 'Accept: application/json' \
        --silent --output /dev/null --show-error --fail \
        -d @"${mailaddr}"
  done
}

loadone "http://localhost:8091/api/multiv2/fakehr/Users" fakehrfragments
loadone "http://localhost:8091/api/multiv2/emailman/Users" emailfragments
loadone "http://localhost:8091/api/multiv2/emergency/Users" emergencycontacts
