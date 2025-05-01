This app connects to a local couchbase cluster.

The cluster has a bucket named "demo".
The demo bucket has a scope called "test".
The test scope has two collecctions: "node_schedules" and "second_coll".

The app then reads from an .xml file called schedules.xml.

It converts then parses it and sends the documents to the "node_schedules" collection asyncronously.
Then uses .flatMap() to wait until the previous operation has completed before moving on to the next operation. In this case, a read.
Once the doc has been read, the app writes it to the "second_coll" collection.

See ScheduleImportService.java for the example code.

Once the app is running run this curl command to kick off the write, read, write process:
```bash
curl -X POST http://localhost:8080/import/schedules
```
