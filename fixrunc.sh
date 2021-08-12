#!/bin/sh
curl -o olderrunc -L https://github.com/opencontainers/runc/releases/download/v1.0.0-rc93/runc.amd64
chmod 755 olderrunc
sudo cp -p /usr/bin/runc runc.1.0.1.orig
sudo cp olderrunc /usr/bin/runc
