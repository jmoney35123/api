
    @RestController
    public class VoteController {

        private VoteRepository voteRepository;

        @Autowired
        public VoteController(VoteRepository voteRepository) {
            this.voteRepository = voteRepository;
        }

        @RequestMapping(value = "/polls/{pollId}/votes", method = RequestMethod.POST)
        public ResponseEntity<?> createVote(@PathVariable Long pollId, @RequestBody Vote
                vote) {
            vote = voteRepository.save(vote);
            // Set the headers for the newly created resource
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.setLocation(ServletUriComponentsBuilder.
                    fromCurrentRequest().path("/{id}").buildAndExpand(vote.getId()).toUri());
            return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
        }
    }
}
