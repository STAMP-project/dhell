var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":118,"id":452,"methods":[{"el":31,"sc":5,"sl":15},{"el":48,"sc":5,"sl":33},{"el":73,"sc":5,"sl":50},{"el":117,"sc":5,"sl":75}],"name":"MyStorageTest","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":15}],"name":"testMyStorageDefault","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":22},{"sl":24},{"sl":25},{"sl":26},{"sl":28},{"sl":29},{"sl":30}]},"test_12":{"methods":[{"sl":50}],"name":"testAddData","pass":true,"statements":[{"sl":53},{"sl":54},{"sl":55},{"sl":61},{"sl":62},{"sl":63},{"sl":65},{"sl":66},{"sl":68},{"sl":71},{"sl":72}]},"test_2":{"methods":[{"sl":75}],"name":"testSaveReadData","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":84},{"sl":90},{"sl":91},{"sl":92},{"sl":95},{"sl":96},{"sl":98},{"sl":100},{"sl":101},{"sl":103},{"sl":104},{"sl":105},{"sl":108},{"sl":109},{"sl":111},{"sl":112},{"sl":113},{"sl":116}]},"test_7":{"methods":[{"sl":33}],"name":"testMyStorageString","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38},{"sl":40},{"sl":42},{"sl":43},{"sl":44},{"sl":46},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [10], [], [], [10], [10], [10], [], [10], [], [10], [10], [10], [], [10], [10], [10], [], [], [7], [], [], [7], [7], [7], [], [7], [], [7], [7], [7], [], [7], [7], [], [], [12], [], [], [12], [12], [12], [], [], [], [], [], [12], [12], [12], [], [12], [12], [], [12], [], [], [12], [12], [], [], [2], [], [], [2], [2], [2], [2], [2], [], [2], [], [], [], [], [], [2], [2], [2], [], [], [2], [2], [], [2], [], [2], [2], [], [2], [2], [2], [], [], [2], [2], [], [2], [2], [2], [], [], [2], [], []]
