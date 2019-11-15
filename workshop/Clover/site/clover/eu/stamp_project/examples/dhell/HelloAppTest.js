var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":199,"id":349,"methods":[{"el":20,"sc":5,"sl":16},{"el":26,"sc":5,"sl":22},{"el":42,"sc":5,"sl":28},{"el":58,"sc":5,"sl":44},{"el":74,"sc":5,"sl":60},{"el":91,"sc":5,"sl":76},{"el":116,"sc":5,"sl":93},{"el":143,"sc":5,"sl":118},{"el":168,"sc":5,"sl":145},{"el":179,"sc":5,"sl":170},{"el":193,"sc":5,"sl":181}],"name":"HelloAppTest","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":60}],"name":"testHelloAppString","pass":true,"statements":[{"sl":63},{"sl":64},{"sl":65},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":72},{"sl":73}]},"test_1":{"methods":[{"sl":93}],"name":"testHelloAppRun1","pass":true,"statements":[{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":102},{"sl":103},{"sl":108},{"sl":109},{"sl":110},{"sl":111},{"sl":113},{"sl":114},{"sl":115}]},"test_11":{"methods":[{"sl":76}],"name":"testHelloAppIntString","pass":true,"statements":[{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":89},{"sl":90}]},"test_3":{"methods":[{"sl":28}],"name":"testHelloAppDefault","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":40},{"sl":41}]},"test_4":{"methods":[{"sl":44}],"name":"testHelloAppInt","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":49},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":56},{"sl":57}]},"test_5":{"methods":[{"sl":145}],"name":"testHelloAppRun3","pass":true,"statements":[{"sl":148},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":157},{"sl":158},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167}]},"test_6":{"methods":[{"sl":118}],"name":"testHelloAppRun2","pass":true,"statements":[{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":129},{"sl":130},{"sl":135},{"sl":136},{"sl":137},{"sl":139},{"sl":140},{"sl":141},{"sl":142}]},"test_8":{"methods":[{"sl":170}],"name":"testHelloAppSomeInfoAreReturned","pass":true,"statements":[{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":178}]},"test_9":{"methods":[{"sl":181}],"name":"testHelloAppDetailedInfoAreReturned","pass":true,"statements":[{"sl":183},{"sl":184},{"sl":185},{"sl":187},{"sl":189},{"sl":192}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3], [], [], [3], [3], [], [3], [3], [3], [3], [3], [], [3], [3], [], [], [4], [], [], [4], [4], [4], [], [4], [4], [4], [4], [], [4], [4], [], [], [0], [], [], [0], [0], [0], [], [0], [0], [0], [0], [], [0], [0], [], [], [11], [], [], [11], [11], [11], [11], [], [11], [11], [11], [11], [], [11], [11], [], [], [1], [], [], [1], [1], [1], [1], [], [], [1], [1], [], [], [], [], [1], [1], [1], [1], [], [1], [1], [1], [], [], [6], [], [], [6], [6], [6], [6], [6], [6], [], [], [6], [6], [], [], [], [], [6], [6], [6], [], [6], [6], [6], [6], [], [], [5], [], [], [5], [5], [5], [5], [5], [5], [5], [], [], [5], [5], [], [], [], [], [5], [5], [5], [5], [5], [], [], [8], [], [8], [8], [8], [8], [], [], [8], [], [], [9], [], [9], [9], [9], [], [9], [], [9], [], [], [9], [], [], [], [], [], [], []]