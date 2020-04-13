SBT=sbt/bin/sbt

.PHONY: sbt

sbt:
	$(SBT)

test:
	$(SBT) test

bench:
	$(SBT) bench:test
