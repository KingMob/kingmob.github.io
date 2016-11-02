#!/bin/bash
## Adapted from deraen.github.io

rev=$(git rev-parse HEAD)
remoteurl=$(git ls-remote --get-url origin)

if [[ ! -d gh-pages ]]; then
    git clone --branch master ${remoteurl} gh-pages
fi
(
cd gh-pages
git pull
)

boot prod
cp -r target/* gh-pages

cd gh-pages

git add --all
git commit -m "Built from ${rev}."
git push origin master